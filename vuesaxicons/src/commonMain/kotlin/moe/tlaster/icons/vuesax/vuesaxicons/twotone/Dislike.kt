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

public val TwotoneGroup.Dislike: ImageVector
    get() {
        if (_dislike != null) {
            return _dislike!!
        }
        _dislike = Builder(name = "Dislike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5197f, 5.6499f)
                lineTo(13.4197f, 3.2499f)
                curveTo(13.0197f, 2.8499f, 12.1197f, 2.6499f, 11.5197f, 2.6499f)
                horizontalLineTo(7.7197f)
                curveTo(6.5197f, 2.6499f, 5.2197f, 3.5499f, 4.9197f, 4.7499f)
                lineTo(2.5197f, 12.0499f)
                curveTo(2.0197f, 13.4499f, 2.9197f, 14.6499f, 4.4197f, 14.6499f)
                horizontalLineTo(8.4197f)
                curveTo(9.0197f, 14.6499f, 9.5197f, 15.1499f, 9.4197f, 15.8499f)
                lineTo(8.9197f, 19.0499f)
                curveTo(8.7197f, 19.9499f, 9.3197f, 20.9499f, 10.2197f, 21.2499f)
                curveTo(11.0197f, 21.5499f, 12.0197f, 21.1499f, 12.4197f, 20.5499f)
                lineTo(16.5197f, 14.4499f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6191f, 5.65f)
                verticalLineTo(15.45f)
                curveTo(21.6191f, 16.85f, 21.0191f, 17.35f, 19.6191f, 17.35f)
                horizontalLineTo(18.6191f)
                curveTo(17.2191f, 17.35f, 16.6191f, 16.85f, 16.6191f, 15.45f)
                verticalLineTo(5.65f)
                curveTo(16.6191f, 4.25f, 17.2191f, 3.75f, 18.6191f, 3.75f)
                horizontalLineTo(19.6191f)
                curveTo(21.0191f, 3.75f, 21.6191f, 4.25f, 21.6191f, 5.65f)
                close()
            }
        }
        .build()
        return _dislike!!
    }

private var _dislike: ImageVector? = null
