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

public val TwotoneGroup.Lampcharge: ImageVector
    get() {
        if (_lampcharge != null) {
            return _lampcharge!!
        }
        _lampcharge = Builder(name = "Lampcharge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 7.8901f)
                lineTo(10.9301f, 9.7501f)
                curveTo(10.6901f, 10.1601f, 10.8901f, 10.5001f, 11.3601f, 10.5001f)
                horizontalLineTo(12.6301f)
                curveTo(13.1101f, 10.5001f, 13.3001f, 10.8401f, 13.0601f, 11.2501f)
                lineTo(12.0001f, 13.1101f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.3004f, 18.0402f)
                verticalLineTo(16.8802f)
                curveTo(6.0003f, 15.4902f, 4.1104f, 12.7802f, 4.1104f, 9.9002f)
                curveTo(4.1104f, 4.9502f, 8.6603f, 1.0702f, 13.8004f, 2.1902f)
                curveTo(16.0604f, 2.6902f, 18.0404f, 4.1902f, 19.0704f, 6.2602f)
                curveTo(21.1604f, 10.4602f, 18.9604f, 14.9202f, 15.7304f, 16.8702f)
                verticalLineTo(18.0302f)
                curveTo(15.7304f, 18.3202f, 15.8404f, 18.9902f, 14.7704f, 18.9902f)
                horizontalLineTo(9.2604f)
                curveTo(8.1603f, 19.0002f, 8.3004f, 18.5702f, 8.3004f, 18.0402f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 22.0002f)
                curveTo(10.79f, 21.3502f, 13.21f, 21.3502f, 15.5f, 22.0002f)
            }
        }
        .build()
        return _lampcharge!!
    }

private var _lampcharge: ImageVector? = null
