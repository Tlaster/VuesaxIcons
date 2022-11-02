package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Arrowright3: ImageVector
    get() {
        if (_arrowright3 != null) {
            return _arrowright3!!
        }
        _arrowright3 = Builder(name = "Arrowright3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0002f)
                verticalLineTo(9.3302f)
                curveTo(6.0f, 6.0202f, 8.35f, 4.6602f, 11.22f, 6.3202f)
                lineTo(13.53f, 7.6602f)
                lineTo(15.84f, 9.0002f)
                curveTo(18.71f, 10.6602f, 18.71f, 13.3702f, 15.84f, 15.0302f)
                lineTo(13.53f, 16.3702f)
                lineTo(11.22f, 17.7102f)
                curveTo(8.35f, 19.3402f, 6.0f, 17.9902f, 6.0f, 14.6702f)
                verticalLineTo(12.0002f)
                close()
            }
        }
        .build()
        return _arrowright3!!
    }

private var _arrowright3: ImageVector? = null
