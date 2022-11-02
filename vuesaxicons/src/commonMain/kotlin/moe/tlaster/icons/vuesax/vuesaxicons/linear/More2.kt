package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.More2: ImageVector
    get() {
        if (_more2 != null) {
            return _more2!!
        }
        _more2 = Builder(name = "More2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0001f, 9.32f)
                curveTo(13.1901f, 9.32f, 14.1601f, 8.35f, 14.1601f, 7.16f)
                curveTo(14.1601f, 5.97f, 13.1901f, 5.0f, 12.0001f, 5.0f)
                curveTo(10.8101f, 5.0f, 9.8401f, 5.97f, 9.8401f, 7.16f)
                curveTo(9.8401f, 8.35f, 10.8101f, 9.32f, 12.0001f, 9.32f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7899f, 18.9999f)
                curveTo(7.9799f, 18.9999f, 8.9499f, 18.0299f, 8.9499f, 16.8399f)
                curveTo(8.9499f, 15.6499f, 7.9799f, 14.6799f, 6.7899f, 14.6799f)
                curveTo(5.5999f, 14.6799f, 4.6299f, 15.6499f, 4.6299f, 16.8399f)
                curveTo(4.6299f, 18.0299f, 5.5899f, 18.9999f, 6.7899f, 18.9999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.21f, 18.9999f)
                curveTo(18.4f, 18.9999f, 19.37f, 18.0299f, 19.37f, 16.8399f)
                curveTo(19.37f, 15.6499f, 18.4f, 14.6799f, 17.21f, 14.6799f)
                curveTo(16.02f, 14.6799f, 15.05f, 15.6499f, 15.05f, 16.8399f)
                curveTo(15.05f, 18.0299f, 16.02f, 18.9999f, 17.21f, 18.9999f)
                close()
            }
        }
        .build()
        return _more2!!
    }

private var _more2: ImageVector? = null
