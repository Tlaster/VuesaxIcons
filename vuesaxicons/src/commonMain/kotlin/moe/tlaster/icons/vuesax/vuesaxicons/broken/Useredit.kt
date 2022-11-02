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

public val BrokenGroup.Useredit: ImageVector
    get() {
        if (_useredit != null) {
            return _useredit!!
        }
        _useredit = Builder(name = "Useredit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.02f, 3.01f)
                curveTo(14.18f, 2.37f, 13.14f, 2.0f, 12.0f, 2.0f)
                curveTo(9.24f, 2.0f, 7.0f, 4.24f, 7.0f, 7.0f)
                curveTo(7.0f, 9.76f, 9.24f, 12.0f, 12.0f, 12.0f)
                curveTo(14.76f, 12.0f, 17.0f, 9.76f, 17.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.2091f, 15.74f)
                lineTo(15.669f, 19.2801f)
                curveTo(15.529f, 19.4201f, 15.3991f, 19.68f, 15.3691f, 19.87f)
                lineTo(15.1791f, 21.22f)
                curveTo(15.1091f, 21.71f, 15.4491f, 22.05f, 15.9391f, 21.98f)
                lineTo(17.289f, 21.79f)
                curveTo(17.479f, 21.76f, 17.7491f, 21.63f, 17.8791f, 21.49f)
                lineTo(21.419f, 17.95f)
                curveTo(22.029f, 17.34f, 22.319f, 16.63f, 21.419f, 15.73f)
                curveTo(20.529f, 14.84f, 19.8191f, 15.13f, 19.2091f, 15.74f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.6992f, 16.25f)
                curveTo(18.9992f, 17.33f, 19.8392f, 18.17f, 20.9192f, 18.47f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4102f, 22.0f)
                curveTo(3.4102f, 18.13f, 7.2602f, 15.0f, 12.0002f, 15.0f)
                curveTo(13.0402f, 15.0f, 14.0402f, 15.15f, 14.9702f, 15.43f)
            }
        }
        .build()
        return _useredit!!
    }

private var _useredit: ImageVector? = null
