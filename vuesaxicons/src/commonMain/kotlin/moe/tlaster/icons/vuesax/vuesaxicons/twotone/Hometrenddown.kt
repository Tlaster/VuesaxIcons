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

public val TwotoneGroup.Hometrenddown: ImageVector
    get() {
        if (_hometrenddown != null) {
            return _hometrenddown!!
        }
        _hometrenddown = Builder(name = "Hometrenddown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.02f, 2.8402f)
                lineTo(3.63f, 7.0402f)
                curveTo(2.73f, 7.7402f, 2.0f, 9.2302f, 2.0f, 10.3602f)
                verticalLineTo(17.7702f)
                curveTo(2.0f, 20.0902f, 3.89f, 21.9902f, 6.21f, 21.9902f)
                horizontalLineTo(17.79f)
                curveTo(20.11f, 21.9902f, 22.0f, 20.0902f, 22.0f, 17.7802f)
                verticalLineTo(10.5002f)
                curveTo(22.0f, 9.2902f, 21.19f, 7.7402f, 20.2f, 7.0502f)
                lineTo(14.02f, 2.7202f)
                curveTo(12.62f, 1.7402f, 10.37f, 1.7902f, 9.02f, 2.8402f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 16.5f)
                lineTo(12.3f, 12.3f)
                lineTo(10.7f, 14.7f)
                lineTo(7.5f, 11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 16.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(14.5f)
            }
        }
        .build()
        return _hometrenddown!!
    }

private var _hometrenddown: ImageVector? = null
