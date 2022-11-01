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

public val OutlineGroup.Textbold: ImageVector
    get() {
        if (_textbold != null) {
            return _textbold!!
        }
        _textbold = Builder(name = "Textbold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0009f, 12.75f)
                horizontalLineTo(4.8809f)
                curveTo(4.4709f, 12.75f, 4.1309f, 12.41f, 4.1309f, 12.0f)
                verticalLineTo(4.5f)
                curveTo(4.1309f, 2.98f, 5.3609f, 1.75f, 6.8809f, 1.75f)
                horizontalLineTo(12.0009f)
                curveTo(15.0309f, 1.75f, 17.5009f, 4.22f, 17.5009f, 7.25f)
                curveTo(17.5009f, 10.28f, 15.0309f, 12.75f, 12.0009f, 12.75f)
                close()
                moveTo(5.6209f, 11.25f)
                horizontalLineTo(12.0009f)
                curveTo(14.2109f, 11.25f, 16.0009f, 9.46f, 16.0009f, 7.25f)
                curveTo(16.0009f, 5.04f, 14.2109f, 3.25f, 12.0009f, 3.25f)
                horizontalLineTo(6.8809f)
                curveTo(6.1909f, 3.25f, 5.6309f, 3.81f, 5.6309f, 4.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(5.6209f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3809f, 22.25f)
                horizontalLineTo(6.8809f)
                curveTo(5.3609f, 22.25f, 4.1309f, 21.02f, 4.1309f, 19.5f)
                verticalLineTo(12.0f)
                curveTo(4.1309f, 11.59f, 4.4709f, 11.25f, 4.8809f, 11.25f)
                horizontalLineTo(14.3809f)
                curveTo(17.4109f, 11.25f, 19.8809f, 13.72f, 19.8809f, 16.75f)
                curveTo(19.8809f, 19.78f, 17.4109f, 22.25f, 14.3809f, 22.25f)
                close()
                moveTo(5.6209f, 12.75f)
                verticalLineTo(19.5f)
                curveTo(5.6209f, 20.19f, 6.1809f, 20.75f, 6.8709f, 20.75f)
                horizontalLineTo(14.3709f)
                curveTo(16.5809f, 20.75f, 18.3709f, 18.96f, 18.3709f, 16.75f)
                curveTo(18.3709f, 14.54f, 16.5809f, 12.75f, 14.3709f, 12.75f)
                horizontalLineTo(5.6209f)
                close()
            }
        }
        .build()
        return _textbold!!
    }

private var _textbold: ImageVector? = null
