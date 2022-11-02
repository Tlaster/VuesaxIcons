package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Locationminus: ImageVector
    get() {
        if (_locationminus != null) {
            return _locationminus!!
        }
        _locationminus = Builder(name = "Locationminus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.25f, 11.0f)
                horizontalLineTo(14.75f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.6197f, 8.49f)
                curveTo(5.5897f, -0.17f, 18.4197f, -0.16f, 20.3797f, 8.5f)
                curveTo(21.5297f, 13.58f, 18.3697f, 17.88f, 15.5997f, 20.54f)
                curveTo(13.5897f, 22.48f, 10.4097f, 22.48f, 8.3897f, 20.54f)
                curveTo(5.6297f, 17.88f, 2.4697f, 13.57f, 3.6197f, 8.49f)
                close()
            }
        }
        .build()
        return _locationminus!!
    }

private var _locationminus: ImageVector? = null
