package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.More2: ImageVector
    get() {
        if (_more2 != null) {
            return _more2!!
        }
        _more2 = Builder(name = "More2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.8398f, 7.16f)
                curveTo(9.8398f, 8.35f, 10.8098f, 9.32f, 11.9998f, 9.32f)
                curveTo(13.1898f, 9.32f, 14.1598f, 8.35f, 14.1598f, 7.16f)
                curveTo(14.1598f, 5.97f, 13.1898f, 5.0f, 11.9998f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7909f, 18.9999f)
                curveTo(7.9809f, 18.9999f, 8.9509f, 18.0299f, 8.9509f, 16.8399f)
                curveTo(8.9509f, 15.6499f, 7.9809f, 14.6799f, 6.7909f, 14.6799f)
                curveTo(5.6009f, 14.6799f, 4.6309f, 15.6499f, 4.6309f, 16.8399f)
                curveTo(4.6309f, 18.0299f, 5.5909f, 18.9999f, 6.7909f, 18.9999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.2108f, 18.9999f)
                curveTo(18.4008f, 18.9999f, 19.3708f, 18.0299f, 19.3708f, 16.8399f)
                curveTo(19.3708f, 15.6499f, 18.4008f, 14.6799f, 17.2108f, 14.6799f)
                curveTo(16.0208f, 14.6799f, 15.0508f, 15.6499f, 15.0508f, 16.8399f)
                curveTo(15.0508f, 18.0299f, 16.0208f, 18.9999f, 17.2108f, 18.9999f)
                close()
            }
        }
        .build()
        return _more2!!
    }

private var _more2: ImageVector? = null
