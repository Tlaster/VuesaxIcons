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

public val TwotoneGroup.Homehashtag: ImageVector
    get() {
        if (_homehashtag != null) {
            return _homehashtag!!
        }
        _homehashtag = Builder(name = "Homehashtag", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(10.5f, 18.0f)
                horizontalLineTo(13.5f)
                curveTo(15.15f, 18.0f, 16.5f, 16.65f, 16.5f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(16.5f, 10.35f, 15.15f, 9.0f, 13.5f, 9.0f)
                horizontalLineTo(10.5f)
                curveTo(8.85f, 9.0f, 7.5f, 10.35f, 7.5f, 12.0f)
                verticalLineTo(15.0f)
                curveTo(7.5f, 16.65f, 8.85f, 18.0f, 10.5f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 13.5f)
                horizontalLineTo(16.5f)
            }
        }
        .build()
        return _homehashtag!!
    }

private var _homehashtag: ImageVector? = null
