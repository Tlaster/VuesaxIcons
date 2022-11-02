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

public val TwotoneGroup.Stopcircle: ImageVector
    get() {
        if (_stopcircle != null) {
            return _stopcircle!!
        }
        _stopcircle = Builder(name = "Stopcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9707f, 22.0f)
                curveTo(17.4936f, 22.0f, 21.9707f, 17.5228f, 21.9707f, 12.0f)
                curveTo(21.9707f, 6.4771f, 17.4936f, 2.0f, 11.9707f, 2.0f)
                curveTo(6.4479f, 2.0f, 1.9707f, 6.4771f, 1.9707f, 12.0f)
                curveTo(1.9707f, 17.5228f, 6.4479f, 22.0f, 11.9707f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7295f, 16.23f)
                horizontalLineTo(13.2695f)
                curveTo(15.3895f, 16.23f, 16.2295f, 15.38f, 16.2295f, 13.27f)
                verticalLineTo(10.73f)
                curveTo(16.2295f, 8.61f, 15.3795f, 7.77f, 13.2695f, 7.77f)
                horizontalLineTo(10.7295f)
                curveTo(8.6095f, 7.77f, 7.7695f, 8.62f, 7.7695f, 10.73f)
                verticalLineTo(13.27f)
                curveTo(7.7695f, 15.38f, 8.6195f, 16.23f, 10.7295f, 16.23f)
                close()
            }
        }
        .build()
        return _stopcircle!!
    }

private var _stopcircle: ImageVector? = null
