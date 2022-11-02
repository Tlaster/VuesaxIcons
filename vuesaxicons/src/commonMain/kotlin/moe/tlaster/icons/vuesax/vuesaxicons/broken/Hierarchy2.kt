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

public val BrokenGroup.Hierarchy2: ImageVector
    get() {
        if (_hierarchy2 != null) {
            return _hierarchy2!!
        }
        _hierarchy2 = Builder(name = "Hierarchy2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                verticalLineTo(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 22.0f)
                curveTo(7.0449f, 22.0f, 8.5f, 20.5449f, 8.5f, 18.75f)
                curveTo(8.5f, 16.9551f, 7.0449f, 15.5f, 5.25f, 15.5f)
                curveTo(3.4551f, 15.5f, 2.0f, 16.9551f, 2.0f, 18.75f)
                curveTo(2.0f, 20.5449f, 3.4551f, 22.0f, 5.25f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                curveTo(6.6568f, 8.0f, 8.0f, 6.6568f, 8.0f, 5.0f)
                curveTo(8.0f, 3.3431f, 6.6568f, 2.0f, 5.0f, 2.0f)
                curveTo(3.3431f, 2.0f, 2.0f, 3.3431f, 2.0f, 5.0f)
                curveTo(2.0f, 6.6568f, 3.3431f, 8.0f, 5.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                curveTo(20.6569f, 8.0f, 22.0f, 6.6568f, 22.0f, 5.0f)
                curveTo(22.0f, 3.3431f, 20.6569f, 2.0f, 19.0f, 2.0f)
                curveTo(17.3431f, 2.0f, 16.0f, 3.3431f, 16.0f, 5.0f)
                curveTo(16.0f, 6.6568f, 17.3431f, 8.0f, 19.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.1309f, 15.0f)
                curveTo(5.5809f, 13.25f, 7.1809f, 11.95f, 9.0709f, 11.96f)
                lineTo(12.5009f, 11.97f)
                curveTo(13.3509f, 11.97f, 14.1709f, 11.8f, 14.9009f, 11.48f)
            }
        }
        .build()
        return _hierarchy2!!
    }

private var _hierarchy2: ImageVector? = null
