package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Stopcircle: ImageVector
    get() {
        if (_stopcircle != null) {
            return _stopcircle!!
        }
        _stopcircle = Builder(name = "Stopcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9707f, 22.75f)
                curveTo(6.0507f, 22.75f, 1.2207f, 17.93f, 1.2207f, 12.0f)
                curveTo(1.2207f, 6.07f, 6.0507f, 1.25f, 11.9707f, 1.25f)
                curveTo(17.8907f, 1.25f, 22.7207f, 6.07f, 22.7207f, 12.0f)
                curveTo(22.7207f, 17.93f, 17.9007f, 22.75f, 11.9707f, 22.75f)
                close()
                moveTo(11.9707f, 2.75f)
                curveTo(6.8707f, 2.75f, 2.7207f, 6.9f, 2.7207f, 12.0f)
                curveTo(2.7207f, 17.1f, 6.8707f, 21.25f, 11.9707f, 21.25f)
                curveTo(17.0707f, 21.25f, 21.2207f, 17.1f, 21.2207f, 12.0f)
                curveTo(21.2207f, 6.9f, 17.0707f, 2.75f, 11.9707f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2695f, 16.98f)
                horizontalLineTo(10.7295f)
                curveTo(8.1995f, 16.98f, 7.0195f, 15.8f, 7.0195f, 13.27f)
                verticalLineTo(10.73f)
                curveTo(7.0195f, 8.2f, 8.1995f, 7.02f, 10.7295f, 7.02f)
                horizontalLineTo(13.2695f)
                curveTo(15.7995f, 7.02f, 16.9795f, 8.2f, 16.9795f, 10.73f)
                verticalLineTo(13.27f)
                curveTo(16.9795f, 15.8f, 15.7995f, 16.98f, 13.2695f, 16.98f)
                close()
                moveTo(10.7295f, 8.52f)
                curveTo(9.0395f, 8.52f, 8.5195f, 9.04f, 8.5195f, 10.73f)
                verticalLineTo(13.27f)
                curveTo(8.5195f, 14.96f, 9.0395f, 15.48f, 10.7295f, 15.48f)
                horizontalLineTo(13.2695f)
                curveTo(14.9595f, 15.48f, 15.4795f, 14.96f, 15.4795f, 13.27f)
                verticalLineTo(10.73f)
                curveTo(15.4795f, 9.04f, 14.9595f, 8.52f, 13.2695f, 8.52f)
                horizontalLineTo(10.7295f)
                close()
            }
        }
        .build()
        return _stopcircle!!
    }

private var _stopcircle: ImageVector? = null
