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

public val BrokenGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0407f, 3.3f)
                curveTo(4.0107f, 5.02f, 1.9707f, 8.27f, 1.9707f, 12.0f)
                curveTo(1.9707f, 17.52f, 6.4507f, 22.0f, 11.9707f, 22.0f)
                curveTo(17.4907f, 22.0f, 21.9707f, 17.52f, 21.9707f, 12.0f)
                curveTo(21.9707f, 6.48f, 17.4907f, 2.0f, 11.9707f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.5f)
                curveTo(14.4853f, 16.5f, 16.5f, 14.4853f, 16.5f, 12.0f)
                curveTo(16.5f, 9.5147f, 14.4853f, 7.5f, 12.0f, 7.5f)
                curveTo(9.5147f, 7.5f, 7.5f, 9.5147f, 7.5f, 12.0f)
                curveTo(7.5f, 14.4853f, 9.5147f, 16.5f, 12.0f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9004f, 4.9299f)
                lineTo(8.4404f, 8.4599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9004f, 19.07f)
                lineTo(8.4404f, 15.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0498f, 19.07f)
                lineTo(15.5098f, 15.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0498f, 4.9299f)
                lineTo(15.5098f, 8.4599f)
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
