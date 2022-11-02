package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Boxsearch: ImageVector
    get() {
        if (_boxsearch != null) {
            return _boxsearch!!
        }
        _boxsearch = Builder(name = "Boxsearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1699f, 7.4399f)
                lineTo(11.9999f, 12.5499f)
                lineTo(20.7699f, 7.4699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.61f)
                verticalLineTo(12.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6106f, 12.83f)
                verticalLineTo(9.17f)
                curveTo(21.6106f, 7.79f, 20.6206f, 6.11f, 19.4106f, 5.44f)
                lineTo(14.0706f, 2.48f)
                curveTo(12.9306f, 1.84f, 11.0706f, 1.84f, 9.9306f, 2.48f)
                lineTo(4.5906f, 5.44f)
                curveTo(3.3806f, 6.11f, 2.3906f, 7.79f, 2.3906f, 9.17f)
                verticalLineTo(14.83f)
                curveTo(2.3906f, 16.21f, 3.3806f, 17.89f, 4.5906f, 18.56f)
                lineTo(9.9306f, 21.52f)
                curveTo(10.5006f, 21.84f, 11.2506f, 22.0f, 12.0006f, 22.0f)
                curveTo(12.7506f, 22.0f, 13.5006f, 21.84f, 14.0706f, 21.52f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2f, 21.4f)
                curveTo(20.9673f, 21.4f, 22.4f, 19.9673f, 22.4f, 18.2f)
                curveTo(22.4f, 16.4327f, 20.9673f, 15.0f, 19.2f, 15.0f)
                curveTo(17.4327f, 15.0f, 16.0f, 16.4327f, 16.0f, 18.2f)
                curveTo(16.0f, 19.9673f, 17.4327f, 21.4f, 19.2f, 21.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 22.0f)
                lineTo(22.0f, 21.0f)
            }
        }
        .build()
        return _boxsearch!!
    }

private var _boxsearch: ImageVector? = null
