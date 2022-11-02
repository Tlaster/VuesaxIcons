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

public val LinearGroup.Discover1: ImageVector
    get() {
        if (_discover1 != null) {
            return _discover1!!
        }
        _discover1 = Builder(name = "Discover1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8f, 2.1f)
                lineTo(7.87f, 4.59f)
                curveTo(6.42f, 4.95f, 4.95f, 6.42f, 4.59f, 7.87f)
                lineTo(2.1f, 17.8f)
                curveTo(1.35f, 20.8f, 3.19f, 22.65f, 6.2f, 21.9f)
                lineTo(16.13f, 19.42f)
                curveTo(17.57f, 19.06f, 19.05f, 17.58f, 19.41f, 16.14f)
                lineTo(21.9f, 6.2f)
                curveTo(22.65f, 3.2f, 20.8f, 1.35f, 17.8f, 2.1f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.5f)
                curveTo(13.933f, 15.5f, 15.5f, 13.933f, 15.5f, 12.0f)
                curveTo(15.5f, 10.067f, 13.933f, 8.5f, 12.0f, 8.5f)
                curveTo(10.067f, 8.5f, 8.5f, 10.067f, 8.5f, 12.0f)
                curveTo(8.5f, 13.933f, 10.067f, 15.5f, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _discover1!!
    }

private var _discover1: ImageVector? = null
