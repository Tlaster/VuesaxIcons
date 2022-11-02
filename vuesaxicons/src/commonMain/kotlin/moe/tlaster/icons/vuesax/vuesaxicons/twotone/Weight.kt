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

public val TwotoneGroup.Weight: ImageVector
    get() {
        if (_weight != null) {
            return _weight!!
        }
        _weight = Builder(name = "Weight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(19.0f, 22.0f, 21.0f, 20.0f, 21.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 4.0f, 19.0f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(5.0f, 2.0f, 3.0f, 4.0f, 3.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 20.0f, 5.0f, 22.0f, 10.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.25f, 8.2899f)
                curveTo(14.26f, 5.6299f, 9.74f, 5.6299f, 6.75f, 8.2899f)
                lineTo(8.93f, 11.7899f)
                curveTo(10.68f, 10.2299f, 13.32f, 10.2299f, 15.07f, 11.7899f)
                lineTo(17.25f, 8.2899f)
                close()
            }
        }
        .build()
        return _weight!!
    }

private var _weight: ImageVector? = null
