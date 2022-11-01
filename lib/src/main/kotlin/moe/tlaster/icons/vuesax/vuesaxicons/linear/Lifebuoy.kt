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

public val LinearGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.97f, 22.0f)
                curveTo(17.4928f, 22.0f, 21.97f, 17.5228f, 21.97f, 12.0f)
                curveTo(21.97f, 6.4771f, 17.4928f, 2.0f, 11.97f, 2.0f)
                curveTo(6.4472f, 2.0f, 1.97f, 6.4771f, 1.97f, 12.0f)
                curveTo(1.97f, 17.5228f, 6.4472f, 22.0f, 11.97f, 22.0f)
                close()
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
                moveTo(4.9f, 4.9299f)
                lineTo(8.44f, 8.4599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9f, 19.07f)
                lineTo(8.44f, 15.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.05f, 19.07f)
                lineTo(15.51f, 15.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.05f, 4.9299f)
                lineTo(15.51f, 8.4599f)
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
