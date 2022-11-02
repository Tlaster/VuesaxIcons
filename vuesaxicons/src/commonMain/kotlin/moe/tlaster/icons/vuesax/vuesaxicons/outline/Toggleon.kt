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

public val OutlineGroup.Toggleon: ImageVector
    get() {
        if (_toggleon != null) {
            return _toggleon!!
        }
        _toggleon = Builder(name = "Toggleon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7f, 16.75f)
                horizontalLineTo(13.3f)
                curveTo(10.88f, 16.75f, 9.75f, 15.62f, 9.75f, 13.2f)
                verticalLineTo(10.8f)
                curveTo(9.75f, 8.38f, 10.88f, 7.25f, 13.3f, 7.25f)
                horizontalLineTo(15.7f)
                curveTo(18.12f, 7.25f, 19.25f, 8.38f, 19.25f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(19.25f, 15.62f, 18.12f, 16.75f, 15.7f, 16.75f)
                close()
                moveTo(13.3f, 8.75f)
                curveTo(11.71f, 8.75f, 11.25f, 9.21f, 11.25f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(11.25f, 14.79f, 11.71f, 15.25f, 13.3f, 15.25f)
                horizontalLineTo(15.7f)
                curveTo(17.29f, 15.25f, 17.75f, 14.79f, 17.75f, 13.2f)
                verticalLineTo(10.8f)
                curveTo(17.75f, 9.21f, 17.29f, 8.75f, 15.7f, 8.75f)
                horizontalLineTo(13.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.75f)
                horizontalLineTo(7.0f)
                curveTo(2.59f, 20.75f, 1.25f, 19.41f, 1.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.25f, 4.59f, 2.59f, 3.25f, 7.0f, 3.25f)
                horizontalLineTo(17.0f)
                curveTo(21.41f, 3.25f, 22.75f, 4.59f, 22.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.75f, 19.41f, 21.41f, 20.75f, 17.0f, 20.75f)
                close()
                moveTo(7.0f, 4.75f)
                curveTo(3.42f, 4.75f, 2.75f, 5.43f, 2.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.75f, 18.57f, 3.42f, 19.25f, 7.0f, 19.25f)
                horizontalLineTo(17.0f)
                curveTo(20.58f, 19.25f, 21.25f, 18.57f, 21.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.25f, 5.43f, 20.58f, 4.75f, 17.0f, 4.75f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _toggleon!!
    }

private var _toggleon: ImageVector? = null
