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

public val TwotoneGroup.Quotedown: ImageVector
    get() {
        if (_quotedown != null) {
            return _quotedown!!
        }
        _quotedown = Builder(name = "Quotedown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9991f, 11.65f)
                horizontalLineTo(16.1991f)
                curveTo(14.6691f, 11.65f, 13.6191f, 10.49f, 13.6191f, 9.07f)
                verticalLineTo(5.85f)
                curveTo(13.6191f, 4.43f, 14.6691f, 3.27f, 16.1991f, 3.27f)
                horizontalLineTo(19.4191f)
                curveTo(20.8391f, 3.27f, 21.9991f, 4.43f, 21.9991f, 5.85f)
                verticalLineTo(11.65f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9988f, 11.6499f)
                curveTo(21.9988f, 17.6999f, 20.8688f, 18.6998f, 17.4688f, 20.7198f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.3702f, 11.65f)
                horizontalLineTo(4.5702f)
                curveTo(3.0402f, 11.65f, 1.9902f, 10.49f, 1.9902f, 9.07f)
                verticalLineTo(5.85f)
                curveTo(1.9902f, 4.43f, 3.0402f, 3.27f, 4.5702f, 3.27f)
                horizontalLineTo(7.8002f)
                curveTo(9.2202f, 3.27f, 10.3802f, 4.43f, 10.3802f, 5.85f)
                verticalLineTo(11.65f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.3698f, 11.6499f)
                curveTo(10.3698f, 17.6999f, 9.2398f, 18.6998f, 5.8398f, 20.7198f)
            }
        }
        .build()
        return _quotedown!!
    }

private var _quotedown: ImageVector? = null
